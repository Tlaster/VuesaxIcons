package moe.tlaster.icons.vuesax.vuesaxicons.linear

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Round
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import moe.tlaster.icons.vuesax.vuesaxicons.LinearGroup

public val LinearGroup.Tagright: ImageVector
    get() {
        if (_tagright != null) {
            return _tagright!!
        }
        _tagright = Builder(name = "Tagright", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(4.22f, 3.1f)
                horizontalLineTo(15.6599f)
                curveTo(16.3399f, 3.1f, 17.19f, 3.57f, 17.55f, 4.15f)
                lineTo(21.73f, 10.83f)
                curveTo(22.13f, 11.48f, 22.09f, 12.5f, 21.63f, 13.11f)
                lineTo(16.45f, 20.01f)
                curveTo(16.08f, 20.5f, 15.28f, 20.9f, 14.67f, 20.9f)
                horizontalLineTo(4.22f)
                curveTo(2.4699f, 20.9f, 1.41f, 18.98f, 2.33f, 17.49f)
                lineTo(5.0999f, 13.06f)
                curveTo(5.47f, 12.47f, 5.47f, 11.51f, 5.0999f, 10.92f)
                lineTo(2.33f, 6.49f)
                curveTo(1.41f, 5.02f, 2.4799f, 3.1f, 4.22f, 3.1f)
                close()
            }
        }
        .build()
        return _tagright!!
    }

private var _tagright: ImageVector? = null
