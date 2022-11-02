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

public val BoldGroup.Receipt1: ImageVector
    get() {
        if (_receipt1 != null) {
            return _receipt1!!
        }
        _receipt1 = Builder(name = "Receipt1", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF292D32)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(2.0f, 7.0f)
                verticalLineTo(21.0f)
                curveTo(2.0f, 21.83f, 2.94f, 22.3f, 3.6f, 21.8f)
                lineTo(5.31f, 20.52f)
                curveTo(5.71f, 20.22f, 6.27f, 20.26f, 6.63f, 20.62f)
                lineTo(8.29f, 22.29f)
                curveTo(8.68f, 22.68f, 9.32f, 22.68f, 9.71f, 22.29f)
                lineTo(11.39f, 20.61f)
                curveTo(11.74f, 20.26f, 12.3f, 20.22f, 12.69f, 20.52f)
                lineTo(14.4f, 21.8f)
                curveTo(15.06f, 22.29f, 16.0f, 21.82f, 16.0f, 21.0f)
                verticalLineTo(4.0f)
                curveTo(16.0f, 2.9f, 16.9f, 2.0f, 18.0f, 2.0f)
                horizontalLineTo(7.0f)
                horizontalLineTo(6.0f)
                curveTo(3.0f, 2.0f, 2.0f, 3.79f, 2.0f, 6.0f)
                verticalLineTo(7.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF292D32)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(18.01f, 2.0f)
                verticalLineTo(3.5f)
                curveTo(18.67f, 3.5f, 19.3f, 3.77f, 19.76f, 4.22f)
                curveTo(20.24f, 4.71f, 20.5f, 5.34f, 20.5f, 6.0f)
                verticalLineTo(8.42f)
                curveTo(20.5f, 9.16f, 20.17f, 9.5f, 19.42f, 9.5f)
                horizontalLineTo(17.5f)
                verticalLineTo(4.01f)
                curveTo(17.5f, 3.73f, 17.73f, 3.5f, 18.01f, 3.5f)
                verticalLineTo(2.0f)
                close()
                moveTo(18.01f, 2.0f)
                curveTo(16.9f, 2.0f, 16.0f, 2.9f, 16.0f, 4.01f)
                verticalLineTo(11.0f)
                horizontalLineTo(19.42f)
                curveTo(21.0f, 11.0f, 22.0f, 10.0f, 22.0f, 8.42f)
                verticalLineTo(6.0f)
                curveTo(22.0f, 4.9f, 21.55f, 3.9f, 20.83f, 3.17f)
                curveTo(20.1f, 2.45f, 19.11f, 2.01f, 18.01f, 2.0f)
                curveTo(18.01f, 2.0f, 18.02f, 2.0f, 18.01f, 2.0f)
                close()
            }
        }
        .build()
        return _receipt1!!
    }

private var _receipt1: ImageVector? = null
