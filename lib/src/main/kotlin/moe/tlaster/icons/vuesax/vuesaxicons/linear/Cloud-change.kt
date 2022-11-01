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

public val LinearGroup.`Cloud-change`: ImageVector
    get() {
        if (`_cloud-change` != null) {
            return `_cloud-change`!!
        }
        `_cloud-change` = Builder(name = "Cloud-change", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(8.11f, 11.85f)
                curveTo(5.29f, 12.05f, 5.3f, 16.15f, 8.11f, 16.35f)
                horizontalLineTo(14.78f)
                curveTo(15.59f, 16.36f, 16.37f, 16.05f, 16.97f, 15.51f)
                curveTo(18.95f, 13.78f, 17.8901f, 10.31f, 15.2901f, 9.98f)
                curveTo(14.3601f, 4.34f, 6.2101f, 6.48f, 8.1401f, 11.85f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(2.0f, 15.0f)
                curveTo(2.0f, 18.87f, 5.13f, 22.0f, 9.0f, 22.0f)
                lineTo(7.95f, 20.25f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(22.0f, 9.0f)
                curveTo(22.0f, 5.13f, 18.87f, 2.0f, 15.0f, 2.0f)
                lineTo(16.05f, 3.75f)
            }
        }
        .build()
        return `_cloud-change`!!
    }

private var `_cloud-change`: ImageVector? = null
