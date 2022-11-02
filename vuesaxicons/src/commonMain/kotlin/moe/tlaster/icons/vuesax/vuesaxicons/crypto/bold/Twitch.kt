package moe.tlaster.icons.vuesax.vuesaxicons.crypto.bold

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.EvenOdd
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import moe.tlaster.icons.vuesax.vuesaxicons.crypto.BoldGroup

public val BoldGroup.Twitch: ImageVector
    get() {
        if (_twitch != null) {
            return _twitch!!
        }
        _twitch = Builder(name = "Twitch", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(20.5f, 2.0f)
                horizontalLineTo(5.04f)
                curveTo(4.71f, 2.0f, 4.39f, 2.17f, 4.21f, 2.45f)
                lineTo(2.67f, 4.75f)
                curveTo(2.56f, 4.91f, 2.5f, 5.11f, 2.5f, 5.3f)
                verticalLineTo(18.0f)
                curveTo(2.5f, 18.55f, 2.95f, 19.0f, 3.5f, 19.0f)
                horizontalLineTo(5.5f)
                curveTo(6.05f, 19.0f, 6.5f, 19.45f, 6.5f, 20.0f)
                verticalLineTo(21.0f)
                curveTo(6.5f, 21.55f, 6.95f, 22.0f, 7.5f, 22.0f)
                horizontalLineTo(8.96f)
                curveTo(9.29f, 22.0f, 9.61f, 21.83f, 9.79f, 21.55f)
                lineTo(11.2f, 19.44f)
                curveTo(11.39f, 19.16f, 11.7f, 18.99f, 12.03f, 18.99f)
                horizontalLineTo(16.08f)
                curveTo(16.35f, 18.99f, 16.6f, 18.88f, 16.79f, 18.7f)
                lineTo(21.2f, 14.29f)
                curveTo(21.39f, 14.1f, 21.49f, 13.85f, 21.49f, 13.58f)
                verticalLineTo(3.0f)
                curveTo(21.5f, 2.45f, 21.05f, 2.0f, 20.5f, 2.0f)
                close()
                moveTo(10.79f, 12.86f)
                curveTo(10.79f, 13.18f, 10.53f, 13.43f, 10.22f, 13.43f)
                horizontalLineTo(9.08f)
                curveTo(8.76f, 13.43f, 8.51f, 13.17f, 8.51f, 12.86f)
                verticalLineTo(7.15f)
                curveTo(8.51f, 6.83f, 8.77f, 6.58f, 9.08f, 6.58f)
                horizontalLineTo(10.22f)
                curveTo(10.54f, 6.58f, 10.79f, 6.84f, 10.79f, 7.15f)
                verticalLineTo(12.86f)
                close()
                moveTo(16.5f, 12.86f)
                curveTo(16.5f, 13.18f, 16.24f, 13.43f, 15.93f, 13.43f)
                horizontalLineTo(14.79f)
                curveTo(14.47f, 13.43f, 14.22f, 13.17f, 14.22f, 12.86f)
                verticalLineTo(7.15f)
                curveTo(14.22f, 6.83f, 14.48f, 6.58f, 14.79f, 6.58f)
                horizontalLineTo(15.93f)
                curveTo(16.25f, 6.58f, 16.5f, 6.84f, 16.5f, 7.15f)
                verticalLineTo(12.86f)
                close()
            }
        }
        .build()
        return _twitch!!
    }

private var _twitch: ImageVector? = null
