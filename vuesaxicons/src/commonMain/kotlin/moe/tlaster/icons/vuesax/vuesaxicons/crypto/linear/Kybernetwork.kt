package moe.tlaster.icons.vuesax.vuesaxicons.crypto.linear

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
import moe.tlaster.icons.vuesax.vuesaxicons.crypto.LinearGroup

public val LinearGroup.Kybernetwork: ImageVector
    get() {
        if (_kybernetwork != null) {
            return _kybernetwork!!
        }
        _kybernetwork = Builder(name = "Kybernetwork", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF17191C)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(11.0f, 2.6f)
                lineTo(6.0f, 5.4001f)
                curveTo(5.4f, 5.8f, 5.0f, 6.4001f, 5.0f, 7.1f)
                verticalLineTo(16.0f)
                curveTo(5.0f, 16.6f, 5.3f, 17.3f, 5.8f, 17.6f)
                lineTo(10.8f, 21.2001f)
                curveTo(11.5f, 21.7001f, 12.4f, 21.7001f, 13.1f, 21.2001f)
                lineTo(18.1f, 17.6f)
                curveTo(18.6f, 17.2f, 18.9f, 16.6f, 18.9f, 16.0f)
                verticalLineTo(7.2f)
                curveTo(18.9f, 6.5001f, 18.5f, 5.8f, 17.9f, 5.5001f)
                lineTo(12.9f, 2.6f)
                curveTo(12.4f, 2.2001f, 11.6f, 2.2001f, 11.0f, 2.6f)
                close()
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF17191C)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(12.0f, 3.0f)
                lineTo(10.0f, 12.0f)
                lineTo(11.8f, 21.2f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF17191C)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(18.2f, 16.9f)
                lineTo(10.0f, 12.0f)
                lineTo(18.5f, 7.3f)
            }
        }
        .build()
        return _kybernetwork!!
    }

private var _kybernetwork: ImageVector? = null
