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

public val OutlineGroup.Scanner: ImageVector
    get() {
        if (_scanner != null) {
            return _scanner!!
        }
        _scanner = Builder(name = "Scanner", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF292D32)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(22.0f, 9.75f)
                curveTo(21.59f, 9.75f, 21.25f, 9.41f, 21.25f, 9.0f)
                verticalLineTo(7.0f)
                curveTo(21.25f, 4.42f, 19.58f, 2.75f, 17.0f, 2.75f)
                horizontalLineTo(7.0f)
                curveTo(4.42f, 2.75f, 2.75f, 4.42f, 2.75f, 7.0f)
                verticalLineTo(9.0f)
                curveTo(2.75f, 9.41f, 2.41f, 9.75f, 2.0f, 9.75f)
                curveTo(1.59f, 9.75f, 1.25f, 9.41f, 1.25f, 9.0f)
                verticalLineTo(7.0f)
                curveTo(1.25f, 3.56f, 3.56f, 1.25f, 7.0f, 1.25f)
                horizontalLineTo(17.0f)
                curveTo(20.44f, 1.25f, 22.75f, 3.56f, 22.75f, 7.0f)
                verticalLineTo(9.0f)
                curveTo(22.75f, 9.41f, 22.41f, 9.75f, 22.0f, 9.75f)
                close()
            }
            path(fill = SolidColor(Color(0xFF292D32)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(17.0f, 22.75f)
                horizontalLineTo(7.0f)
                curveTo(3.56f, 22.75f, 1.25f, 20.44f, 1.25f, 17.0f)
                verticalLineTo(15.0f)
                curveTo(1.25f, 14.59f, 1.59f, 14.25f, 2.0f, 14.25f)
                curveTo(2.41f, 14.25f, 2.75f, 14.59f, 2.75f, 15.0f)
                verticalLineTo(17.0f)
                curveTo(2.75f, 19.58f, 4.42f, 21.25f, 7.0f, 21.25f)
                horizontalLineTo(17.0f)
                curveTo(19.58f, 21.25f, 21.25f, 19.58f, 21.25f, 17.0f)
                verticalLineTo(15.0f)
                curveTo(21.25f, 14.59f, 21.59f, 14.25f, 22.0f, 14.25f)
                curveTo(22.41f, 14.25f, 22.75f, 14.59f, 22.75f, 15.0f)
                verticalLineTo(17.0f)
                curveTo(22.75f, 20.44f, 20.44f, 22.75f, 17.0f, 22.75f)
                close()
            }
            path(fill = SolidColor(Color(0xFF292D32)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(22.0f, 12.75f)
                horizontalLineTo(2.0f)
                curveTo(1.59f, 12.75f, 1.25f, 12.41f, 1.25f, 12.0f)
                curveTo(1.25f, 11.59f, 1.59f, 11.25f, 2.0f, 11.25f)
                horizontalLineTo(22.0f)
                curveTo(22.41f, 11.25f, 22.75f, 11.59f, 22.75f, 12.0f)
                curveTo(22.75f, 12.41f, 22.41f, 12.75f, 22.0f, 12.75f)
                close()
            }
        }
        .build()
        return _scanner!!
    }

private var _scanner: ImageVector? = null
