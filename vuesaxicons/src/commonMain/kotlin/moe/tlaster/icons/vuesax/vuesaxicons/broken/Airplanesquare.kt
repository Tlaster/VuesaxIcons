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

public val BrokenGroup.Airplanesquare: ImageVector
    get() {
        if (_airplanesquare != null) {
            return _airplanesquare!!
        }
        _airplanesquare = Builder(name = "Airplanesquare", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(9.8595f, 19.0f)
                lineTo(11.5395f, 17.58f)
                curveTo(11.7895f, 17.37f, 12.2095f, 17.37f, 12.4695f, 17.58f)
                lineTo(14.1395f, 19.0f)
                curveTo(14.5295f, 19.2f, 15.0095f, 19.0f, 15.1495f, 18.58f)
                lineTo(15.4695f, 17.62f)
                curveTo(15.5495f, 17.39f, 15.4695f, 17.05f, 15.2995f, 16.88f)
                lineTo(13.6595f, 15.23f)
                curveTo(13.5395f, 15.11f, 13.4495f, 14.88f, 13.4495f, 14.72f)
                verticalLineTo(12.87f)
                curveTo(13.4495f, 12.45f, 13.7595f, 12.25f, 14.1495f, 12.41f)
                lineTo(17.4995f, 13.85f)
                curveTo(18.0495f, 14.09f, 18.5095f, 13.79f, 18.5095f, 13.19f)
                verticalLineTo(12.26f)
                curveTo(18.5095f, 11.78f, 18.1495f, 11.22f, 17.6995f, 11.03f)
                lineTo(13.7595f, 9.33f)
                curveTo(13.5895f, 9.26f, 13.4595f, 9.05f, 13.4595f, 8.87f)
                verticalLineTo(6.8f)
                curveTo(13.4595f, 6.12f, 12.9595f, 5.32f, 12.3595f, 5.01f)
                curveTo(12.1395f, 4.9f, 11.8895f, 4.9f, 11.6695f, 5.01f)
                curveTo(11.0595f, 5.31f, 10.5695f, 6.12f, 10.5695f, 6.8f)
                verticalLineTo(8.87f)
                curveTo(10.5695f, 9.05f, 10.4295f, 9.26f, 10.2695f, 9.33f)
                lineTo(6.3295f, 11.03f)
                curveTo(5.8895f, 11.22f, 5.5195f, 11.78f, 5.5195f, 12.26f)
                verticalLineTo(13.19f)
                curveTo(5.5195f, 13.79f, 5.9695f, 14.09f, 6.5295f, 13.85f)
                lineTo(9.8795f, 12.41f)
                curveTo(10.2595f, 12.24f, 10.5795f, 12.45f, 10.5795f, 12.87f)
                verticalLineTo(14.72f)
                curveTo(10.5795f, 14.89f, 10.4795f, 15.12f, 10.3695f, 15.23f)
                lineTo(8.6995f, 16.87f)
                curveTo(8.5295f, 17.04f, 8.4495f, 17.38f, 8.5295f, 17.61f)
                lineTo(8.8495f, 18.57f)
                curveTo(8.9895f, 19.0f, 9.4595f, 19.2f, 9.8595f, 19.0f)
                close()
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(2.0f, 12.95f)
                verticalLineTo(15.0f)
                curveTo(2.0f, 20.0f, 4.0f, 22.0f, 9.0f, 22.0f)
                horizontalLineTo(15.0f)
                curveTo(20.0f, 22.0f, 22.0f, 20.0f, 22.0f, 15.0f)
                verticalLineTo(9.0f)
                curveTo(22.0f, 4.0f, 20.0f, 2.0f, 15.0f, 2.0f)
                horizontalLineTo(9.0f)
                curveTo(4.0f, 2.0f, 2.0f, 4.0f, 2.0f, 9.0f)
            }
        }
        .build()
        return _airplanesquare!!
    }

private var _airplanesquare: ImageVector? = null
