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

public val LinearGroup.`Profile-delete`: ImageVector
    get() {
        if (`_profile-delete` != null) {
            return `_profile-delete`!!
        }
        `_profile-delete` = Builder(name = "Profile-delete", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(18.41f, 18.09f)
                lineTo(15.59f, 20.91f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(18.41f, 20.91f)
                lineTo(15.59f, 18.09f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(12.1601f, 10.87f)
                curveTo(12.0601f, 10.86f, 11.9401f, 10.86f, 11.8301f, 10.87f)
                curveTo(9.4501f, 10.79f, 7.5601f, 8.84f, 7.5601f, 6.44f)
                curveTo(7.5601f, 3.99f, 9.5401f, 2.0f, 12.0001f, 2.0f)
                curveTo(14.4501f, 2.0f, 16.4401f, 3.99f, 16.4401f, 6.44f)
                curveTo(16.4301f, 8.84f, 14.5401f, 10.79f, 12.1601f, 10.87f)
                close()
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(12.0f, 21.8101f)
                curveTo(10.18f, 21.8101f, 8.3701f, 21.3501f, 6.99f, 20.4301f)
                curveTo(4.57f, 18.8101f, 4.57f, 16.1701f, 6.99f, 14.5601f)
                curveTo(9.7401f, 12.7201f, 14.25f, 12.7201f, 17.0f, 14.5601f)
            }
        }
        .build()
        return `_profile-delete`!!
    }

private var `_profile-delete`: ImageVector? = null
