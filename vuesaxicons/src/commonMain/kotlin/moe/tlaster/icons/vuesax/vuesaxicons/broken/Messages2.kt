package moe.tlaster.icons.vuesax.vuesaxicons.broken

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeCap.Companion.Round
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import moe.tlaster.icons.vuesax.vuesaxicons.BrokenGroup

public val BrokenGroup.Messages2: ImageVector
    get() {
        if (_messages2 != null) {
            return _messages2!!
        }
        _messages2 = Builder(name = "Messages2", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(13.1698f, 2.0f)
                curveTo(8.2899f, 2.0f, 4.3398f, 5.69f, 4.3398f, 10.24f)
                curveTo(4.3398f, 10.5f, 4.3499f, 10.75f, 4.3798f, 11.0f)
                curveTo(5.2698f, 10.42f, 6.3398f, 10.09f, 7.4998f, 10.09f)
                curveTo(10.5398f, 10.09f, 12.9998f, 12.39f, 12.9998f, 15.23f)
                curveTo(12.9998f, 16.42f, 12.5599f, 17.52f, 11.8199f, 18.39f)
                curveTo(12.2599f, 18.45f, 12.7098f, 18.48f, 13.1698f, 18.48f)
                lineTo(17.3598f, 20.97f)
                curveTo(18.0698f, 21.4f, 18.9598f, 20.82f, 18.8598f, 19.99f)
                lineTo(18.4698f, 16.83f)
                curveTo(20.6098f, 15.33f, 21.9998f, 12.94f, 21.9998f, 10.24f)
                curveTo(21.9998f, 7.17f, 20.1999f, 4.49f, 17.5199f, 3.07f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(4.38f, 11.0001f)
                curveTo(5.27f, 10.4201f, 6.34f, 10.0901f, 7.5f, 10.0901f)
                curveTo(10.54f, 10.0901f, 13.0f, 12.39f, 13.0f, 15.23f)
                curveTo(13.0f, 16.42f, 12.56f, 17.5201f, 11.82f, 18.3901f)
                curveTo(10.83f, 19.5901f, 9.26f, 20.36f, 7.5f, 20.36f)
                lineTo(4.89f, 21.91f)
                curveTo(4.45f, 22.18f, 3.89f, 21.81f, 3.95f, 21.3f)
                lineTo(4.2f, 19.3301f)
                curveTo(2.86f, 18.4001f, 2.0f, 16.91f, 2.0f, 15.23f)
                curveTo(2.0f, 14.93f, 2.03f, 14.64f, 2.08f, 14.36f)
            }
        }
        .build()
        return _messages2!!
    }

private var _messages2: ImageVector? = null
