package moe.tlaster.icons.vuesax.vuesaxicons.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import moe.tlaster.icons.vuesax.vuesaxicons.OutlineGroup

public val OutlineGroup.Rotateleft1: ImageVector
    get() {
        if (_rotateleft1 != null) {
            return _rotateleft1!!
        }
        _rotateleft1 = Builder(name = "Rotateleft1", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF292D32)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(11.75f, 22.75f)
                horizontalLineTo(7.25f)
                curveTo(3.1f, 22.75f, 1.25f, 20.9f, 1.25f, 16.75f)
                verticalLineTo(12.25f)
                curveTo(1.25f, 8.1f, 3.1f, 6.25f, 7.25f, 6.25f)
                horizontalLineTo(11.75f)
                curveTo(15.9f, 6.25f, 17.75f, 8.1f, 17.75f, 12.25f)
                verticalLineTo(16.75f)
                curveTo(17.75f, 20.9f, 15.9f, 22.75f, 11.75f, 22.75f)
                close()
                moveTo(7.25f, 7.75f)
                curveTo(3.93f, 7.75f, 2.75f, 8.93f, 2.75f, 12.25f)
                verticalLineTo(16.75f)
                curveTo(2.75f, 20.07f, 3.93f, 21.25f, 7.25f, 21.25f)
                horizontalLineTo(11.75f)
                curveTo(15.07f, 21.25f, 16.25f, 20.07f, 16.25f, 16.75f)
                verticalLineTo(12.25f)
                curveTo(16.25f, 8.93f, 15.07f, 7.75f, 11.75f, 7.75f)
                horizontalLineTo(7.25f)
                close()
            }
            path(fill = SolidColor(Color(0xFF292D32)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(22.0004f, 9.75f)
                curveTo(21.5904f, 9.75f, 21.2504f, 9.41f, 21.2504f, 9.0f)
                curveTo(21.2504f, 6.04f, 19.1904f, 3.56f, 16.4204f, 2.91f)
                lineTo(16.6904f, 3.36f)
                curveTo(16.9004f, 3.72f, 16.7904f, 4.18f, 16.4304f, 4.39f)
                curveTo(16.0704f, 4.6f, 15.6104f, 4.49f, 15.4004f, 4.13f)
                lineTo(14.3504f, 2.38f)
                curveTo(14.2104f, 2.15f, 14.2104f, 1.86f, 14.3404f, 1.63f)
                curveTo(14.4804f, 1.4f, 14.7304f, 1.25f, 15.0004f, 1.25f)
                curveTo(19.2704f, 1.25f, 22.7504f, 4.73f, 22.7504f, 9.0f)
                curveTo(22.7504f, 9.41f, 22.4104f, 9.75f, 22.0004f, 9.75f)
                close()
            }
        }
        .build()
        return _rotateleft1!!
    }

private var _rotateleft1: ImageVector? = null
