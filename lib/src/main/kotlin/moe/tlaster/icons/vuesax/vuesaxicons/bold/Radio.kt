package moe.tlaster.icons.vuesax.vuesaxicons.bold

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
import moe.tlaster.icons.vuesax.vuesaxicons.BoldGroup

public val BoldGroup.Radio: ImageVector
    get() {
        if (_radio != null) {
            return _radio!!
        }
        _radio = Builder(name = "Radio", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF292D32)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(7.75f, 2.0f)
                verticalLineTo(5.0f)
                horizontalLineTo(7.0f)
                curveTo(6.74f, 5.0f, 6.49f, 5.01f, 6.25f, 5.05f)
                verticalLineTo(2.0f)
                curveTo(6.25f, 1.59f, 6.59f, 1.25f, 7.0f, 1.25f)
                curveTo(7.41f, 1.25f, 7.75f, 1.59f, 7.75f, 2.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF292D32)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(17.0f, 5.0f)
                horizontalLineTo(7.0f)
                curveTo(6.74f, 5.0f, 6.49f, 5.01f, 6.25f, 5.05f)
                curveTo(3.67f, 5.35f, 2.0f, 7.26f, 2.0f, 10.0f)
                verticalLineTo(17.0f)
                curveTo(2.0f, 20.0f, 4.0f, 22.0f, 7.0f, 22.0f)
                horizontalLineTo(17.0f)
                curveTo(20.0f, 22.0f, 22.0f, 20.0f, 22.0f, 17.0f)
                verticalLineTo(10.0f)
                curveTo(22.0f, 7.0f, 20.0f, 5.0f, 17.0f, 5.0f)
                close()
                moveTo(7.88f, 16.0f)
                curveTo(6.5f, 16.0f, 5.38f, 14.88f, 5.38f, 13.5f)
                curveTo(5.38f, 12.12f, 6.5f, 11.0f, 7.88f, 11.0f)
                curveTo(9.26f, 11.0f, 10.38f, 12.12f, 10.38f, 13.5f)
                curveTo(10.38f, 14.88f, 9.26f, 16.0f, 7.88f, 16.0f)
                close()
                moveTo(14.38f, 16.25f)
                horizontalLineTo(13.88f)
                curveTo(13.47f, 16.25f, 13.13f, 15.91f, 13.13f, 15.5f)
                curveTo(13.13f, 15.09f, 13.47f, 14.75f, 13.88f, 14.75f)
                horizontalLineTo(14.38f)
                curveTo(14.79f, 14.75f, 15.13f, 15.09f, 15.13f, 15.5f)
                curveTo(15.13f, 15.91f, 14.79f, 16.25f, 14.38f, 16.25f)
                close()
                moveTo(17.88f, 16.25f)
                horizontalLineTo(17.38f)
                curveTo(16.97f, 16.25f, 16.63f, 15.91f, 16.63f, 15.5f)
                curveTo(16.63f, 15.09f, 16.97f, 14.75f, 17.38f, 14.75f)
                horizontalLineTo(17.88f)
                curveTo(18.29f, 14.75f, 18.63f, 15.09f, 18.63f, 15.5f)
                curveTo(18.63f, 15.91f, 18.29f, 16.25f, 17.88f, 16.25f)
                close()
                moveTo(17.88f, 12.25f)
                horizontalLineTo(13.88f)
                curveTo(13.47f, 12.25f, 13.13f, 11.91f, 13.13f, 11.5f)
                curveTo(13.13f, 11.09f, 13.47f, 10.75f, 13.88f, 10.75f)
                horizontalLineTo(17.88f)
                curveTo(18.29f, 10.75f, 18.63f, 11.09f, 18.63f, 11.5f)
                curveTo(18.63f, 11.91f, 18.29f, 12.25f, 17.88f, 12.25f)
                close()
            }
        }
        .build()
        return _radio!!
    }

private var _radio: ImageVector? = null
