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

public val OutlineGroup.Man: ImageVector
    get() {
        if (_man != null) {
            return _man!!
        }
        _man = Builder(name = "Man", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp, viewportWidth
                = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF292D32)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(10.25f, 22.25f)
                curveTo(5.56f, 22.25f, 1.75f, 18.44f, 1.75f, 13.75f)
                curveTo(1.75f, 9.06f, 5.56f, 5.25f, 10.25f, 5.25f)
                curveTo(14.94f, 5.25f, 18.75f, 9.06f, 18.75f, 13.75f)
                curveTo(18.75f, 18.44f, 14.94f, 22.25f, 10.25f, 22.25f)
                close()
                moveTo(10.25f, 6.75f)
                curveTo(6.39f, 6.75f, 3.25f, 9.89f, 3.25f, 13.75f)
                curveTo(3.25f, 17.61f, 6.39f, 20.75f, 10.25f, 20.75f)
                curveTo(14.11f, 20.75f, 17.25f, 17.61f, 17.25f, 13.75f)
                curveTo(17.25f, 9.89f, 14.11f, 6.75f, 10.25f, 6.75f)
                close()
            }
            path(fill = SolidColor(Color(0xFF292D32)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(16.0004f, 8.7499f)
                curveTo(15.8104f, 8.7499f, 15.6204f, 8.6799f, 15.4704f, 8.5299f)
                curveTo(15.1804f, 8.2399f, 15.1804f, 7.7599f, 15.4704f, 7.4699f)
                lineTo(20.9704f, 1.9699f)
                curveTo(21.2604f, 1.6799f, 21.7404f, 1.6799f, 22.0304f, 1.9699f)
                curveTo(22.3204f, 2.2599f, 22.3204f, 2.7399f, 22.0304f, 3.0299f)
                lineTo(16.5304f, 8.5299f)
                curveTo(16.3804f, 8.6799f, 16.1904f, 8.7499f, 16.0004f, 8.7499f)
                close()
            }
            path(fill = SolidColor(Color(0xFF292D32)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(21.5f, 9.75f)
                curveTo(21.09f, 9.75f, 20.75f, 9.41f, 20.75f, 9.0f)
                verticalLineTo(3.25f)
                horizontalLineTo(15.0f)
                curveTo(14.59f, 3.25f, 14.25f, 2.91f, 14.25f, 2.5f)
                curveTo(14.25f, 2.09f, 14.59f, 1.75f, 15.0f, 1.75f)
                horizontalLineTo(21.5f)
                curveTo(21.91f, 1.75f, 22.25f, 2.09f, 22.25f, 2.5f)
                verticalLineTo(9.0f)
                curveTo(22.25f, 9.41f, 21.91f, 9.75f, 21.5f, 9.75f)
                close()
            }
        }
        .build()
        return _man!!
    }

private var _man: ImageVector? = null
