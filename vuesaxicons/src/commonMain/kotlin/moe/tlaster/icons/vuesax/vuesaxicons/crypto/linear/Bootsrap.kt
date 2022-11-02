package moe.tlaster.icons.vuesax.vuesaxicons.crypto.linear

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.StrokeJoin.Companion.Round
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import moe.tlaster.icons.vuesax.vuesaxicons.crypto.LinearGroup

public val LinearGroup.Bootsrap: ImageVector
    get() {
        if (_bootsrap != null) {
            return _bootsrap!!
        }
        _bootsrap = Builder(name = "Bootsrap", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF17191C)),
                    strokeLineWidth = 1.5f, strokeLineCap = Butt, strokeLineJoin = Round,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(17.0f, 3.0f)
                horizontalLineTo(7.0f)
                curveTo(5.3f, 3.0f, 4.0f, 4.3f, 4.0f, 6.0f)
                verticalLineTo(6.8f)
                curveTo(4.0f, 7.6f, 3.9f, 8.3f, 3.6f, 9.1f)
                curveTo(3.3f, 10.2f, 2.2f, 11.0f, 1.0f, 11.0f)
                verticalLineTo(13.0f)
                curveTo(2.2f, 13.0f, 3.3f, 13.8f, 3.6f, 14.9f)
                curveTo(3.9f, 15.6f, 4.0f, 16.4f, 4.0f, 17.2f)
                verticalLineTo(18.0f)
                curveTo(4.0f, 19.7f, 5.3f, 21.0f, 7.0f, 21.0f)
                horizontalLineTo(17.0f)
                curveTo(18.7f, 21.0f, 20.0f, 19.7f, 20.0f, 18.0f)
                verticalLineTo(17.2f)
                curveTo(20.0f, 16.4f, 20.1f, 15.7f, 20.4f, 14.9f)
                curveTo(20.8f, 13.8f, 21.8f, 13.0f, 23.0f, 13.0f)
                verticalLineTo(11.0f)
                curveTo(21.8f, 11.0f, 20.7f, 10.2f, 20.4f, 9.1f)
                curveTo(20.1f, 8.4f, 20.0f, 7.6f, 20.0f, 6.8f)
                verticalLineTo(6.0f)
                curveTo(20.0f, 4.3f, 18.7f, 3.0f, 17.0f, 3.0f)
                close()
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF17191C)),
                    strokeLineWidth = 1.5f, strokeLineCap = StrokeCap.Companion.Round,
                    strokeLineJoin = Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(9.7998f, 12.0f)
                horizontalLineTo(12.6998f)
                curveTo(13.8998f, 12.0f, 14.7998f, 12.9f, 14.7998f, 14.1f)
                curveTo(14.7998f, 15.3f, 13.8998f, 16.2f, 12.6998f, 16.2f)
                horizontalLineTo(9.7998f)
                verticalLineTo(7.8f)
                horizontalLineTo(12.6998f)
                curveTo(13.8998f, 7.8f, 14.7998f, 8.7001f, 14.7998f, 9.9001f)
                curveTo(14.7998f, 11.1f, 13.8998f, 12.0f, 12.6998f, 12.0f)
                horizontalLineTo(9.7998f)
                close()
            }
        }
        .build()
        return _bootsrap!!
    }

private var _bootsrap: ImageVector? = null
