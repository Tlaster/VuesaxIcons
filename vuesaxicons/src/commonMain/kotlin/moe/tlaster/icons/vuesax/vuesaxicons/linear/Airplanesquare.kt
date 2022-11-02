package moe.tlaster.icons.vuesax.vuesaxicons.linear

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
import moe.tlaster.icons.vuesax.vuesaxicons.LinearGroup

public val LinearGroup.Airplanesquare: ImageVector
    get() {
        if (_airplanesquare != null) {
            return _airplanesquare!!
        }
        _airplanesquare = Builder(name = "Airplanesquare", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(9.86f, 19.0f)
                lineTo(11.54f, 17.58f)
                curveTo(11.79f, 17.37f, 12.21f, 17.37f, 12.47f, 17.58f)
                lineTo(14.14f, 19.0f)
                curveTo(14.53f, 19.2f, 15.01f, 19.0f, 15.15f, 18.58f)
                lineTo(15.47f, 17.62f)
                curveTo(15.55f, 17.39f, 15.47f, 17.05f, 15.3f, 16.88f)
                lineTo(13.66f, 15.23f)
                curveTo(13.54f, 15.11f, 13.45f, 14.88f, 13.45f, 14.72f)
                verticalLineTo(12.87f)
                curveTo(13.45f, 12.45f, 13.76f, 12.25f, 14.15f, 12.41f)
                lineTo(17.5f, 13.85f)
                curveTo(18.05f, 14.09f, 18.51f, 13.79f, 18.51f, 13.19f)
                verticalLineTo(12.26f)
                curveTo(18.51f, 11.78f, 18.15f, 11.22f, 17.7f, 11.03f)
                lineTo(13.76f, 9.33f)
                curveTo(13.59f, 9.26f, 13.46f, 9.05f, 13.46f, 8.87f)
                verticalLineTo(6.8f)
                curveTo(13.46f, 6.12f, 12.96f, 5.32f, 12.36f, 5.01f)
                curveTo(12.14f, 4.9f, 11.89f, 4.9f, 11.67f, 5.01f)
                curveTo(11.06f, 5.31f, 10.57f, 6.12f, 10.57f, 6.8f)
                verticalLineTo(8.87f)
                curveTo(10.57f, 9.05f, 10.43f, 9.26f, 10.27f, 9.33f)
                lineTo(6.33f, 11.03f)
                curveTo(5.89f, 11.22f, 5.52f, 11.78f, 5.52f, 12.26f)
                verticalLineTo(13.19f)
                curveTo(5.52f, 13.79f, 5.97f, 14.09f, 6.53f, 13.85f)
                lineTo(9.88f, 12.41f)
                curveTo(10.26f, 12.24f, 10.58f, 12.45f, 10.58f, 12.87f)
                verticalLineTo(14.72f)
                curveTo(10.58f, 14.89f, 10.48f, 15.12f, 10.37f, 15.23f)
                lineTo(8.7f, 16.87f)
                curveTo(8.53f, 17.04f, 8.45f, 17.38f, 8.53f, 17.61f)
                lineTo(8.85f, 18.57f)
                curveTo(8.99f, 19.0f, 9.46f, 19.2f, 9.86f, 19.0f)
                close()
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(9.0f, 22.0f)
                horizontalLineTo(15.0f)
                curveTo(20.0f, 22.0f, 22.0f, 20.0f, 22.0f, 15.0f)
                verticalLineTo(9.0f)
                curveTo(22.0f, 4.0f, 20.0f, 2.0f, 15.0f, 2.0f)
                horizontalLineTo(9.0f)
                curveTo(4.0f, 2.0f, 2.0f, 4.0f, 2.0f, 9.0f)
                verticalLineTo(15.0f)
                curveTo(2.0f, 20.0f, 4.0f, 22.0f, 9.0f, 22.0f)
                close()
            }
        }
        .build()
        return _airplanesquare!!
    }

private var _airplanesquare: ImageVector? = null
