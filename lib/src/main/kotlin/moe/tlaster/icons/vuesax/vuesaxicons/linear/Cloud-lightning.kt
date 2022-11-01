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

public val LinearGroup.`Cloud-lightning`: ImageVector
    get() {
        if (`_cloud-lightning` != null) {
            return `_cloud-lightning`!!
        }
        `_cloud-lightning` = Builder(name = "Cloud-lightning", defaultWidth = 24.0.dp, defaultHeight
                = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(16.61f, 19.9999f)
                curveTo(17.95f, 20.0099f, 19.24f, 19.5099f, 20.23f, 18.6099f)
                curveTo(23.5f, 15.7499f, 21.75f, 10.0099f, 17.44f, 9.4699f)
                curveTo(15.9f, 0.1299f, 2.43f, 3.67f, 5.62f, 12.5599f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(7.2801f, 12.97f)
                curveTo(6.7501f, 12.7f, 6.1601f, 12.56f, 5.5701f, 12.57f)
                curveTo(0.9101f, 12.9f, 0.9201f, 19.68f, 5.5701f, 20.01f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(15.8201f, 9.89f)
                curveTo(16.3401f, 9.63f, 16.9001f, 9.49f, 17.4801f, 9.48f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(9.2301f, 19.16f)
                horizontalLineTo(10.2301f)
                verticalLineTo(21.49f)
                curveTo(10.2301f, 21.83f, 10.6601f, 22.0f, 10.8801f, 21.74f)
                lineTo(13.3301f, 18.95f)
                curveTo(13.6301f, 18.61f, 13.5001f, 18.33f, 13.0501f, 18.33f)
                horizontalLineTo(12.0501f)
                verticalLineTo(16.0f)
                curveTo(12.0501f, 15.66f, 11.6201f, 15.49f, 11.4001f, 15.75f)
                lineTo(8.9501f, 18.54f)
                curveTo(8.6501f, 18.88f, 8.7801f, 19.16f, 9.2301f, 19.16f)
                close()
            }
        }
        .build()
        return `_cloud-lightning`!!
    }

private var `_cloud-lightning`: ImageVector? = null
