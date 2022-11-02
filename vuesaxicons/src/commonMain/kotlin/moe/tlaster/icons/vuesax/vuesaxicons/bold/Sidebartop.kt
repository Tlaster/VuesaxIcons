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

public val BoldGroup.Sidebartop: ImageVector
    get() {
        if (_sidebartop != null) {
            return _sidebartop!!
        }
        _sidebartop = Builder(name = "Sidebartop", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF292D32)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(20.9493f, 4.13f)
                curveTo(20.6593f, 3.71f, 20.2893f, 3.34f, 19.8693f, 3.05f)
                curveTo(18.9193f, 2.36f, 17.6793f, 2.0f, 16.1893f, 2.0f)
                horizontalLineTo(7.8093f)
                curveTo(4.3693f, 2.0f, 2.2393f, 3.94f, 2.0293f, 7.22f)
                horizontalLineTo(21.9793f)
                curveTo(21.8993f, 5.99f, 21.5493f, 4.95f, 20.9493f, 4.13f)
                close()
            }
            path(fill = SolidColor(Color(0xFF292D32)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(2.0f, 16.1888f)
                curveTo(2.0f, 17.6788f, 2.36f, 18.9188f, 3.05f, 19.8688f)
                curveTo(3.34f, 20.2888f, 3.71f, 20.6588f, 4.13f, 20.9488f)
                curveTo(5.08f, 21.6388f, 6.32f, 21.9987f, 7.81f, 21.9987f)
                horizontalLineTo(16.19f)
                curveTo(19.83f, 21.9987f, 22.0f, 19.8288f, 22.0f, 16.1888f)
                verticalLineTo(8.7188f)
                horizontalLineTo(2.0f)
                verticalLineTo(16.1888f)
                close()
                moveTo(8.91f, 14.4387f)
                lineTo(11.47f, 11.8787f)
                curveTo(11.76f, 11.5887f, 12.24f, 11.5887f, 12.53f, 11.8787f)
                lineTo(15.09f, 14.4387f)
                curveTo(15.24f, 14.5887f, 15.31f, 14.7788f, 15.31f, 14.9688f)
                curveTo(15.31f, 15.1587f, 15.24f, 15.3487f, 15.09f, 15.4987f)
                curveTo(14.8f, 15.7887f, 14.32f, 15.7887f, 14.03f, 15.4987f)
                lineTo(12.0f, 13.4787f)
                lineTo(9.97f, 15.4987f)
                curveTo(9.68f, 15.7887f, 9.2f, 15.7887f, 8.91f, 15.4987f)
                curveTo(8.62f, 15.2087f, 8.62f, 14.7387f, 8.91f, 14.4387f)
                close()
            }
        }
        .build()
        return _sidebartop!!
    }

private var _sidebartop: ImageVector? = null
