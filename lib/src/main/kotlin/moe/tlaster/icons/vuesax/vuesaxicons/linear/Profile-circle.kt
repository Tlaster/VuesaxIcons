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

public val LinearGroup.`Profile-circle`: ImageVector
    get() {
        if (`_profile-circle` != null) {
            return `_profile-circle`!!
        }
        `_profile-circle` = Builder(name = "Profile-circle", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(12.12f, 12.78f)
                curveTo(12.05f, 12.77f, 11.96f, 12.77f, 11.88f, 12.78f)
                curveTo(10.12f, 12.72f, 8.72f, 11.28f, 8.72f, 9.51f)
                curveTo(8.72f, 7.7f, 10.18f, 6.23f, 12.0f, 6.23f)
                curveTo(13.81f, 6.23f, 15.28f, 7.7f, 15.28f, 9.51f)
                curveTo(15.27f, 11.28f, 13.88f, 12.72f, 12.12f, 12.78f)
                close()
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(18.74f, 19.3801f)
                curveTo(16.96f, 21.0101f, 14.6f, 22.0001f, 12.0f, 22.0001f)
                curveTo(9.4f, 22.0001f, 7.04f, 21.0101f, 5.26f, 19.3801f)
                curveTo(5.36f, 18.4401f, 5.96f, 17.5201f, 7.03f, 16.8001f)
                curveTo(9.77f, 14.9801f, 14.25f, 14.9801f, 16.97f, 16.8001f)
                curveTo(18.04f, 17.5201f, 18.64f, 18.4401f, 18.74f, 19.3801f)
                close()
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(12.0f, 22.0f)
                curveTo(17.5228f, 22.0f, 22.0f, 17.5228f, 22.0f, 12.0f)
                curveTo(22.0f, 6.4771f, 17.5228f, 2.0f, 12.0f, 2.0f)
                curveTo(6.4771f, 2.0f, 2.0f, 6.4771f, 2.0f, 12.0f)
                curveTo(2.0f, 17.5228f, 6.4771f, 22.0f, 12.0f, 22.0f)
                close()
            }
        }
        .build()
        return `_profile-circle`!!
    }

private var `_profile-circle`: ImageVector? = null
