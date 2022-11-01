package moe.tlaster.icons.vuesax.vuesaxicons.bold

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import moe.tlaster.icons.vuesax.vuesaxicons.BoldGroup

public val BoldGroup.Man: ImageVector
    get() {
        if (_man != null) {
            return _man!!
        }
        _man = Builder(name = "Man", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp, viewportWidth
                = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF292D32)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(22.19f, 2.21f)
                curveTo(22.12f, 2.03f, 21.97f, 1.88f, 21.79f, 1.81f)
                curveTo(21.69f, 1.77f, 21.6f, 1.75f, 21.5f, 1.75f)
                horizontalLineTo(15.0f)
                curveTo(14.59f, 1.75f, 14.25f, 2.09f, 14.25f, 2.5f)
                curveTo(14.25f, 2.91f, 14.59f, 3.25f, 15.0f, 3.25f)
                horizontalLineTo(19.69f)
                lineTo(15.18f, 7.77f)
                horizontalLineTo(15.17f)
                curveTo(13.83f, 6.66f, 12.12f, 6.0f, 10.25f, 6.0f)
                curveTo(5.97f, 6.0f, 2.5f, 9.47f, 2.5f, 13.75f)
                curveTo(2.5f, 18.03f, 5.97f, 21.5f, 10.25f, 21.5f)
                curveTo(14.53f, 21.5f, 18.0f, 18.03f, 18.0f, 13.75f)
                curveTo(18.0f, 11.88f, 17.34f, 10.17f, 16.23f, 8.83f)
                lineTo(20.75f, 4.31f)
                verticalLineTo(9.0f)
                curveTo(20.75f, 9.41f, 21.09f, 9.75f, 21.5f, 9.75f)
                curveTo(21.91f, 9.75f, 22.25f, 9.41f, 22.25f, 9.0f)
                verticalLineTo(2.5f)
                curveTo(22.25f, 2.4f, 22.23f, 2.31f, 22.19f, 2.21f)
                close()
            }
        }
        .build()
        return _man!!
    }

private var _man: ImageVector? = null
