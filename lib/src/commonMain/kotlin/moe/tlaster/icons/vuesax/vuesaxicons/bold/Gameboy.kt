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

public val BoldGroup.Gameboy: ImageVector
    get() {
        if (_gameboy != null) {
            return _gameboy!!
        }
        _gameboy = Builder(name = "Gameboy", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF292D32)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(17.0f, 2.0f)
                horizontalLineTo(7.0f)
                curveTo(4.8f, 2.0f, 3.0f, 3.8f, 3.0f, 6.0f)
                verticalLineTo(18.0f)
                curveTo(3.0f, 20.2f, 4.8f, 22.0f, 7.0f, 22.0f)
                horizontalLineTo(17.0f)
                curveTo(19.2f, 22.0f, 21.0f, 20.2f, 21.0f, 18.0f)
                verticalLineTo(6.0f)
                curveTo(21.0f, 3.8f, 19.2f, 2.0f, 17.0f, 2.0f)
                close()
                moveTo(10.86f, 18.14f)
                curveTo(10.71f, 18.29f, 10.52f, 18.36f, 10.33f, 18.36f)
                curveTo(10.14f, 18.36f, 9.95f, 18.29f, 9.8f, 18.14f)
                lineTo(9.15f, 17.49f)
                lineTo(8.53f, 18.11f)
                curveTo(8.38f, 18.26f, 8.19f, 18.33f, 8.0f, 18.33f)
                curveTo(7.81f, 18.33f, 7.62f, 18.26f, 7.47f, 18.11f)
                curveTo(7.18f, 17.82f, 7.18f, 17.34f, 7.47f, 17.05f)
                lineTo(8.09f, 16.43f)
                lineTo(7.5f, 15.84f)
                curveTo(7.21f, 15.55f, 7.21f, 15.07f, 7.5f, 14.78f)
                curveTo(7.79f, 14.49f, 8.27f, 14.49f, 8.56f, 14.78f)
                lineTo(9.15f, 15.37f)
                lineTo(9.77f, 14.75f)
                curveTo(10.06f, 14.46f, 10.54f, 14.46f, 10.83f, 14.75f)
                curveTo(11.12f, 15.04f, 11.12f, 15.52f, 10.83f, 15.81f)
                lineTo(10.21f, 16.43f)
                lineTo(10.86f, 17.08f)
                curveTo(11.15f, 17.37f, 11.15f, 17.85f, 10.86f, 18.14f)
                close()
                moveTo(14.49f, 18.49f)
                curveTo(13.94f, 18.49f, 13.49f, 18.05f, 13.49f, 17.5f)
                verticalLineTo(17.48f)
                curveTo(13.49f, 16.93f, 13.94f, 16.48f, 14.49f, 16.48f)
                curveTo(15.04f, 16.48f, 15.49f, 16.93f, 15.49f, 17.48f)
                curveTo(15.49f, 18.03f, 15.04f, 18.49f, 14.49f, 18.49f)
                close()
                moveTo(16.51f, 16.33f)
                curveTo(15.96f, 16.33f, 15.5f, 15.88f, 15.5f, 15.33f)
                curveTo(15.5f, 14.78f, 15.94f, 14.33f, 16.49f, 14.33f)
                horizontalLineTo(16.51f)
                curveTo(17.06f, 14.33f, 17.51f, 14.78f, 17.51f, 15.33f)
                curveTo(17.51f, 15.88f, 17.06f, 16.33f, 16.51f, 16.33f)
                close()
                moveTo(18.0f, 9.25f)
                curveTo(18.0f, 10.21f, 17.21f, 11.0f, 16.25f, 11.0f)
                horizontalLineTo(7.75f)
                curveTo(6.79f, 11.0f, 6.0f, 10.21f, 6.0f, 9.25f)
                verticalLineTo(6.75f)
                curveTo(6.0f, 5.79f, 6.79f, 5.0f, 7.75f, 5.0f)
                horizontalLineTo(16.25f)
                curveTo(17.21f, 5.0f, 18.0f, 5.79f, 18.0f, 6.75f)
                verticalLineTo(9.25f)
                close()
            }
        }
        .build()
        return _gameboy!!
    }

private var _gameboy: ImageVector? = null
