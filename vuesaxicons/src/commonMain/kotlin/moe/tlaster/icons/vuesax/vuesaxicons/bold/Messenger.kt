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

public val BoldGroup.Messenger: ImageVector
    get() {
        if (_messenger != null) {
            return _messenger!!
        }
        _messenger = Builder(name = "Messenger", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 2.0f)
                curveTo(6.48f, 2.0f, 2.0f, 6.15f, 2.0f, 11.26f)
                curveTo(2.0f, 14.16f, 3.44f, 16.74f, 5.68f, 18.44f)
                verticalLineTo(20.29f)
                curveTo(5.68f, 21.06f, 6.5f, 21.54f, 7.17f, 21.16f)
                lineTo(9.03f, 20.11f)
                curveTo(9.97f, 20.38f, 10.96f, 20.52f, 11.99f, 20.52f)
                curveTo(17.51f, 20.52f, 21.99f, 16.37f, 21.99f, 11.26f)
                curveTo(22.0f, 6.15f, 17.52f, 2.0f, 12.0f, 2.0f)
                close()
                moveTo(15.51f, 10.44f)
                lineTo(13.01f, 13.43f)
                curveTo(12.85f, 13.62f, 12.59f, 13.66f, 12.38f, 13.54f)
                lineTo(11.37f, 12.95f)
                curveTo(11.26f, 12.89f, 11.13f, 12.87f, 11.0f, 12.9f)
                lineTo(8.99f, 13.39f)
                curveTo(8.52f, 13.5f, 8.18f, 12.95f, 8.49f, 12.58f)
                lineTo(11.03f, 9.56f)
                curveTo(11.18f, 9.38f, 11.44f, 9.33f, 11.65f, 9.44f)
                lineTo(12.83f, 10.06f)
                curveTo(12.94f, 10.12f, 13.07f, 10.13f, 13.19f, 10.1f)
                lineTo(15.01f, 9.63f)
                curveTo(15.47f, 9.51f, 15.82f, 10.07f, 15.51f, 10.44f)
                close()
            }
        }
        .build()
        return _messenger!!
    }

private var _messenger: ImageVector? = null
