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

public val LinearGroup.`User-octagon`: ImageVector
    get() {
        if (`_user-octagon` != null) {
            return `_user-octagon`!!
        }
        `_user-octagon` = Builder(name = "User-octagon", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(21.08f, 8.58f)
                verticalLineTo(15.42f)
                curveTo(21.08f, 16.54f, 20.48f, 17.58f, 19.51f, 18.15f)
                lineTo(13.57f, 21.58f)
                curveTo(12.6f, 22.14f, 11.4f, 22.14f, 10.42f, 21.58f)
                lineTo(4.48f, 18.15f)
                curveTo(3.51f, 17.59f, 2.91f, 16.55f, 2.91f, 15.42f)
                verticalLineTo(8.58f)
                curveTo(2.91f, 7.46f, 3.51f, 6.42f, 4.48f, 5.85f)
                lineTo(10.42f, 2.42f)
                curveTo(11.39f, 1.86f, 12.59f, 1.86f, 13.57f, 2.42f)
                lineTo(19.51f, 5.85f)
                curveTo(20.48f, 6.42f, 21.08f, 7.45f, 21.08f, 8.58f)
                close()
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(12.0f, 11.0001f)
                curveTo(13.2869f, 11.0001f, 14.33f, 9.9569f, 14.33f, 8.67f)
                curveTo(14.33f, 7.3832f, 13.2869f, 6.3401f, 12.0f, 6.3401f)
                curveTo(10.7132f, 6.3401f, 9.67f, 7.3832f, 9.67f, 8.67f)
                curveTo(9.67f, 9.9569f, 10.7132f, 11.0001f, 12.0f, 11.0001f)
                close()
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(16.0f, 16.6601f)
                curveTo(16.0f, 14.8601f, 14.21f, 13.4001f, 12.0f, 13.4001f)
                curveTo(9.79f, 13.4001f, 8.0f, 14.8601f, 8.0f, 16.6601f)
            }
        }
        .build()
        return `_user-octagon`!!
    }

private var `_user-octagon`: ImageVector? = null
